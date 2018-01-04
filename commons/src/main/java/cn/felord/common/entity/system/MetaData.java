package cn.felord.common.entity.system;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 图片元数据
 *
 * @author dax.
 * @version v1.0
 * @since 2017/12/8 16:21
 */

public class MetaData implements Serializable {
    private static final long serialVersionUID = -8920932807668876644L;
    private String fileName;
    private byte[] data;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "fileName:" + fileName +
                ", data:" + Arrays.toString(data) +
                '}';
    }
}
