package hoo;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class img_test {

    public static void main(String[] args){
        //String pathname = "D:\\img_test.txt";
        String pathname = "D:\\sd.txt";
        try {
            FileReader reader = new FileReader(pathname);
            BufferedReader br = new BufferedReader(reader);
            List<String> urls = new LinkedList<String>();
            String line = null;
            //网友推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                urls.add(line);
            }
            getImgWidthHeight(urls);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getImgWidthHeight(List<String> urls){
        List<String> unUseUrl = new ArrayList<String>();
        if(urls != null && !urls.isEmpty()){
            Long start = System.currentTimeMillis();
            try {
                if(!(urls instanceof RandomAccess)){
                    Iterator<String> it = urls.iterator();
                    for(;it.hasNext();) {
                        Long temp = System.currentTimeMillis();
                        String urlStr = it.next();
                        URL url = new URL(urlStr);
                        URLConnection connection = url.openConnection();
                        connection.setDoOutput(true);
                        BufferedImage image = ImageIO.read(connection.getInputStream());
                        if(image != null) {
                            int srcWidth = image.getWidth();// 源图宽度
                            int srcHeight = image.getHeight();// 源图高度
                            System.out.println("srcWidth = " + srcWidth + " srcHeight = " + srcHeight + " useTime = " + (System.currentTimeMillis() - temp));
                            if (srcWidth < srcHeight || (srcWidth < 800 && srcHeight < 600)) {
                                unUseUrl.add(urlStr+"   srcWidth = " + srcWidth + " srcHeight = " + srcHeight);
                            }
                        }
                    }
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("allTime = " + (System.currentTimeMillis() - start));
            for(String str : unUseUrl){
                System.out.println(str);
            }
        }
    }
}
