public class Food
{
    private String namefood;
    private String brand;
    private String productioncountry;
    private float price;
    private float calories;
    private String ingredients;
    private String factoryaddress;
    private float weight;
    private Date production;
    private Date expiration;

    public Food()
    {
        namefood=null;
        brand=null;
        productioncountry=null;
        price=0;
        calories=0;
        ingredients=null;
        factoryaddress=null;
        weight=0;
        production=null;
        expiration=null;
    }
    public  Food(String namefood, String brand, String productioncountry, float price, float calories, String ingredients, String factoryaddress, Float weight, Date production, Date expiration)
    {
        this.namefood = namefood;
        this.brand= brand;
        this.productioncountry = productioncountry;
        this.price= price;
        this.calories= calories;
        this.ingredients= ingredients;
        this.factoryaddress= factoryaddress;
        this.weight= weight;
        this.production= production;
        this.expiration= expiration;
    }

    public void setNamefood(String namefood)
    {
        this.namefood = namefood;
    }

    public String getNamefood()
    {
        return namefood;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setProductioncountry(String productioncountry)
    {
        this.productioncountry = productioncountry;
    }

    public String getProductioncountry()
    {
        return productioncountry;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public float getPrice()
    {
        return price;
    }

    public void setCalories(float calories)
    {
        this.calories = calories;
    }

    public float getCalories()
    {
        return calories;
    }

    public void setIngredients(String ingredients)
    {
        this.ingredients = ingredients;
    }

    public String getIngredients()
    {
        return ingredients;
    }

    public void setFactoryaddress(String factoryaddress)
    {
        this.factoryaddress = factoryaddress;
    }

    public String getFactoryaddress()
    {
        return factoryaddress;
    }

    public void setWeight(Float weight)
    {
        this.weight = weight;
    }

    public Float getWeight()
    {
        return weight;
    }

    public void setProduction(Date production)
    {
        this.production = production;
    }

    public Date getProduction()
    {
        return production;
    }

    public void setExpiration(Date expiration)
    {
        this.expiration = expiration;
    }

    public Date getExpiration()
    {
        return expiration;
    }

    public void print()
    {
        System.out.println("namefood:"+namefood);
        System.out.println("brand:"+brand);
        System.out.println("production country:"+productioncountry);
        System.out.println("price:"+price);
        System.out.println("calories:"+calories);
        System.out.println("ingredients:"+ingredients);
        System.out.println("factoryaddress:"+factoryaddress);
        System.out.println("weight:"+weight);


        production.print();
        expiration.print();
    }

}
