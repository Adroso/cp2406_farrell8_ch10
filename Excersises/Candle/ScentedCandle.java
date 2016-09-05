package Candle;

/**
 * Created by Adroso360 on 5/09/2016.
 */
public class ScentedCandle extends Candle
{
    private String scent;
    public String getScent()
    {
        return scent;
    }
    public void setScent(String scent)
    {
        this.scent = scent;
    }
    @Override
    public void setHeight(int h)
    {
        final double PER_INCH = 3;
        super.setHeight(h);
        price = h * PER_INCH;
    }
}