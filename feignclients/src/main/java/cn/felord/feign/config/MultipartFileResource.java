package cn.felord.feign.config;

import org.springframework.core.io.InputStreamResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author dax.
 * @version v1.0
 * @since 2017/12/27 11:15
 */

public class MultipartFileResource extends InputStreamResource {

    private String filename;
    private long size;


    public MultipartFileResource(String filename, long size, InputStream inputStream) {
        super(inputStream);
        this.size = size;
        this.filename = filename;
    }
    @Override
    public String getFilename() {
        return this.filename;
    }
    @Override
    public InputStream getInputStream() throws IOException, IllegalStateException {
        //To change body of generated methods, choose Tools | Templates.
        return super.getInputStream();
    }

    @Override
    public long contentLength(){
        return size;
    }

}
