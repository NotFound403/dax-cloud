package cn.felord.upload.util;

import com.xiaoleilu.hutool.io.FileUtil;
import com.xiaoleilu.hutool.io.file.FileReader;
import com.xiaoleilu.hutool.io.file.FileWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * The type File util.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/13 14:10
 */
public class UploadUtil {
    /**
     * The constant ROOT.
     */
    public static final String ROOT = System.getProperty("user.dir").substring(0, System.getProperty("user.dir").lastIndexOf("\\"));

    private static final Logger log = LoggerFactory.getLogger(UploadUtil.class);

    private UploadUtil() {
    }

    /**
     * Write tofile boolean.
     *
     * @param data the data
     * @param path the path
     * @return the boolean
     */
    public static boolean writeToFile(byte[] data, String path) {
        try {

            FileWriter fileWriter = new FileWriter(ROOT + path);
            fileWriter.write(data, 0, data.length);
            return true;
        } catch (Exception e) {
            log.debug("data is fail to  written", e);
        }
        return false;
    }

    /**
     * Save file boolean.
     *
     * @param multipartFile the multipart file
     * @param path          the path
     * @return the boolean
     */
    public static boolean saveMultipartFile(MultipartFile multipartFile, String path) {


        if (multipartFile != null && !multipartFile.isEmpty()) {

            try {
                File file = new File(ROOT + path);
                FileUtil.mkParentDirs(file);
                multipartFile.transferTo(file);
                return true;
            } catch (IOException e) {
                log.debug("multipartFile is fail to  written, name: {}", multipartFile.getOriginalFilename());
            }
        }
        return false;
    }

    /**
     * Read file byte [ ].
     *
     * @param path the path
     * @return the byte [ ]
     */
    public static byte[] readFile(String path) {
        FileReader fileReader = FileReader.create(new File(path));
        return fileReader.readBytes();
    }

    /**
     * Delele files.
     *
     * @param paths the paths
     */
    public static void deleleFiles(String[] paths) {
        for (String p : paths) {
            delete(p);
        }
    }

    /**
     * Delele boolean.
     *
     * @param path the path
     * @return the boolean
     */
    public static boolean delete(String path) {
        boolean flag = false;
        try {
            FileReader fileReader = FileReader.create(new File(path));
            File file = fileReader.getFile();
            flag = file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return flag;
    }

}
