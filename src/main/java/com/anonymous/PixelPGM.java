package com.anonymous;

public class PixelPGM extends Pixel {

    private Integer greyValue;

    /**
     * PixelPGM constructor with a default value of 0
     */
    public PixelPGM() {
        super();
        this.greyValue = 0;
    }

    /**
     * Get the current value of the pixel
     * @return The grey value of the current pixel in an array
     */
    public Integer[] getPixelValue() {
        return new Integer[] { this.greyValue };
    }

    /**
     * PixelPGM constrcutor with a custom value
     * @param greyValue The greyValue of PixelPGM
     */
    public PixelPGM(Integer greyValue) {
        super();
        this.greyValue = greyValue;
    }

    /**
     * Set the greyValue of the pixel
     * @param greyValue The new value for greyValue
     */
    public void setGreyValue(Integer greyValue) {
        this.greyValue = greyValue;
    }
}
