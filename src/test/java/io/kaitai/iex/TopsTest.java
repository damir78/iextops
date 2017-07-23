package io.kaitai.iex;

import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

/**
 * Files located https://www.iextrading.com/trading/market-data/#hist
 * <p>
 * Used: 2017-07-21 -> https://www.googleapis.com/download/storage/v1/b/iex/o/data%2Ffeeds%2F20170721%2F20170721_IEXTP1_TOPS1.5.pcap.gz?generation=1500681896257578&alt=media
 * <p>
 * Created by damir on 23.07.17.
 */
public class TopsTest {

    public static final String FILE_NAME = "20170721_IEXTP1_TOPS1.5.pcap";

    @Test
    public void fromFile() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(FILE_NAME);

        Assert.assertNotNull(resource);

        Tops tops = Tops.fromFile(resource.getFile());

    }

}
