public class Rectangle
{
    private float length;
    private float width;
    private String color;
    public Rectangle()
    {
     width=length=0;
     color=null;
    }
    public Rectangle(float a, float b)
    {
        width=a;
        length=b;
        color="black";
    }
    public Rectangle(float a, float b, String c)
    {
        width=a;
        length=b;
        color=c;
    }



    public void setWidth(float a)
    {
        if(a<0)
            width=0;
        else
          width=a;
    }

    public float getWidth()
    {
        return width;
    }

    public void setLength(float b)
    {
        if(b<0)
            length=0;
        else
            length=b;
    }

    public float getLength()
    {
        return length;
    }

    public void setColor(String c)
    {
        color = c;
    }

    public String getColor()
    {
        return color;
    }

    public float masahat()
    {
        return length*width;
    }

    public float mohit()
    {
        return 2*(length+width);
    }

    public void print()
    {
        System.out.println("width is:"+width);
        System.out.println("length is:"+length);
        System.out.println("color is:"+color);
    }


}
