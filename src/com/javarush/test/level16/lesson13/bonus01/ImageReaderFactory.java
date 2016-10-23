package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by kostya on 10/23/16.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes im)  {
        if (ImageTypes.BMP.equals(im)) return new BmpReader();
        if (ImageTypes.JPG.equals(im)) return new JpgReader();
        if (ImageTypes.PNG.equals(im)) return new PngReader();
        throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
