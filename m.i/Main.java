import java.util.Objects;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
//مستطیل r1 را از کاربرد دریافت کنید
       Rectangle r1=new Rectangle();
        System.out.print("enter width r1:");
        float a= sc.nextFloat();
        r1.setWidth(a);
        System.out.print("enter length r1:");
        float b= sc.nextFloat();
        r1.setLength(b);
        System.out.print("enter color r1:");
        String c= sc.nextLine();
        r1.setColor(c);
        r1.setColor(sc.nextLine());
        System.out.print("mohit r1 is:");
        System.out.println(r1.mohit());
        System.out.print("masahat r1 is:");
        System.out.println(r1.masahat());

//مستطیل r2 را با عرض 2 و طول 5 ایجاد کنید
        Rectangle r2 = new Rectangle(2,5);
//محیط و مساحت مستطیل r2 را چاپ کنید
        System.out.print("masahat r2:");
        System.out.println(r2.masahat());
        System.out.print("mohit r2:");
        System.out.println(r2.mohit());
//رنگ مستطیل r2 را به سبز تغییر دهید
        r2.setColor("green");
        System.out.println("color of rectangle r2:"+r2.getColor());
//اطلاعات مستطیل r1 را چاپ کنید
        System.out.println("information r1:");
        r1.print();
//اطلاعات مستطیل r2 را چاپ کنید
        System.out.println("information r2:");
        r2.print();
//ایا عرض مستطیل r1 با عرض مستطیل r2 برابر است؟
        if(r1.getWidth()== r2.getWidth())
        {
            System.out.println("The width of r1 and r2 are equal");
        }
        else
        {
            System.out.println("The width of r1 and r2 are not equal");
        }
//ایا طول مسطتیل r1 با طول مستطیل r2 برابر است؟ در صورت برابر نبودند بگویید طول کدام یک بیشتر است

        if(r1.getLength()==r2.getLength())
        {
            System.out.println("The length of r1 and r2 are equal");
        }
        else
        {
            if(r1.getLength() > r2.getLength())
            {
                System.out.println("The length of r1 is greater than the length of r2");
            }
            else
            {
                System.out.println("The length of r2 is greater than the length of r1");
            }
        }

//ایا رنگ مستطیل r1 با رنگ مستطیل r2 یکی است؟
        if(Objects.equals(r1.getColor(), r2.getColor()))
        {
            System.out.println("The color of r1 and r2 are equal");
        }
        else
        {
            System.out.println("The color of r1 and r2 are not equal");
        }
//بین مستطیل r1 و r2 کدام مساحت بیشتری دارد؟
        if (r1.masahat() == r2.masahat())
        {
            System.out.println("The masahat of r1 and r2 are equal");
        }
        else
        {
            if (r1.masahat() > r2.masahat())
            {
                System.out.println("The area of r1 is greater than the area of r2");
            }
            else
            {
                System.out.println("The area of r2 is greater than the area of r1");
            }
        }


        int day;
        int month;
        int year;

//nextClass:

//اطلاعات دو محصول غذایی را از کاربر بگیرید
       Food f1=new Food();
        System.out.print("enter namefood food 1:");
        String namefood1= sc.nextLine();
        f1.setNamefood(namefood1);
        //f1.setName(sc.nextLine());

        System.out.print("enter brand food 1:");
        String brand1= sc.nextLine();
        f1.setBrand(brand1);
        //f1.setBrand(sc.nextLine());

        System.out.print("enter production country food 1:");
        String productioncountry1= sc.nextLine();
        f1.setProductioncountry(productioncountry1);
        //f1.setProductionlocation(sc.nextLine());


        System.out.print("enter price food 1:");
        float price1=sc.nextFloat();
        f1.setPrice(price1);
        //f1.setPrice(sc.nextFloat());

        System.out.print("enter calories food 1:");
        float calories1=sc.nextFloat();
        f1.setCalories(calories1);
        //f1.setCalories(sc.nextFloat());

        System.out.print("enter ingredients food 1:");
        String ingredients1=sc.nextLine();
        f1.setIngredients(ingredients1);
        f1.setIngredients(sc.nextLine());


        System.out.print("enter factoryaddress food 1:");
        String factoryaddress1=sc.nextLine();
        f1.setFactoryaddress(factoryaddress1);
        //f1.setFactoryaddress(sc.nextLine());

        System.out.print("enter weight food 1:");
        float weight1=sc.nextFloat();
        f1.setWeight(weight1);
        //f1.setWeight(sc.nextFloat());

       Date dp1=new Date();
        System.out.print("enter the production day: ");
        day= sc.nextInt();
        dp1.setDay(day);
        //dp1.setDay(sc.nextInt());

        System.out.print("enter the production month: ");
        month= sc.nextInt();
        dp1.setMonth(month);
        //dp1.setMonth(sc.nextInt());

        System.out.print("enter the production year: ");
        year= sc.nextInt();
        dp1.setYear(year);
        //dp1.setYear(sc.nextInt());


        Date dx1=new Date();
        System.out.print("enter the expiration day:");
        day= sc.nextInt();
        dx1.setDay(day);
        //dx1.setDay(sc.nextInt());

        System.out.print("enter the expiration month:");
        month= sc.nextInt();
        dx1.setMonth(month);
        //dx1.setMonth(sc.nextInt());

        System.out.print("enter the expiration year:");
        year= sc.nextInt();
        dx1.setYear(year);
        //dx1.setYear(sc.nextInt());

        f1.setProduction(dp1);
        f1.setExpiration(dx1);



        Food f2=new Food();
        System.out.print("enter namefood food 2:");
        String namefood2= sc.nextLine();
        f2.setNamefood(namefood2);
        f2.setNamefood(sc.nextLine());

        System.out.print("enter brand food 2:");
        String brand2= sc.nextLine();
        f2.setBrand(brand2);
        //f2.setBrand(sc.nextLine());

        System.out.print("enter production country food 2:");
        String productioncountry2= sc.nextLine();
        f2.setProductioncountry(productioncountry2);
        //f2.setProductionlocation(sc.nextLine());


        System.out.print("enter price food 2:");
        float price2=sc.nextFloat();
        f2.setPrice(price2);
        //f2.setPrice(sc.nextFloat());

        System.out.print("enter calories food 2:");
        float calories2=sc.nextFloat();
        f2.setCalories(calories2);
        //f2.setCalories(sc.nextFloat());

        System.out.print("enter ingredients food 2:");
        String ingredients2=sc.nextLine();
        f2.setIngredients(ingredients2);
        f2.setIngredients(sc.nextLine());


        System.out.print("enter factoryaddress food 2:");
        String factoryaddress2=sc.nextLine();
        f2.setFactoryaddress(factoryaddress2);
        //f2.setFactoryaddress(sc.nextLine());

        System.out.print("enter weight food 2:");
        float weight2=sc.nextFloat();
        f2.setWeight(weight2);
        //f2.setWeight(sc.nextFloat());


       Date dp2=new Date();
        System.out.print("enter the production day food 2: ");
        day= sc.nextInt();
        dp2.setDay(day);
        //dp2.setDay(sc.nextInt());

        System.out.print("enter the production month food 2: ");
        month= sc.nextInt();
        dp2.setMonth(month);
        //dp2.setMonth(sc.nextInt());

        System.out.print("enter the production year food 2: ");
        year= sc.nextInt();
        dp2.setYear(year);
        //dp2.setYear(sc.nextInt());


        Date dx2=new Date();
        System.out.print("enter the expiration day food 2:");
        day= sc.nextInt();
        dx2.setDay(day);
        //dx2.setDay(sc.nextInt());

        System.out.print("enter the expiration month food 2:");
        month= sc.nextInt();
        dx2.setMonth(month);
        //dx2.setMonth(sc.nextInt());

        System.out.print("enter the expiration year food 2:");
        year= sc.nextInt();
        dx2.setYear(year);
        //dx2.setYear(sc.nextInt());

        f2.setProduction(dp2);
        f2.setExpiration(dx2);
//ایا دو محصول در یک کشور تولید شدند؟
        if(Objects.equals(f1.getProductioncountry(),f2.getProductioncountry()))
        {
            System.out.println("The country of production of both products is the same");
        }
        else
        {
            System.out.println("The country of production of both products is not the same");
        }
 //قیمت کدام محصول ارزان تر است؟
        if(f1.getPrice()> f2.getPrice())
        {
            System.out.println("The first food product is cheaper");
        }
        else
        {
            System.out.println("The second food product is cheaper");
        }
//ایا کالری دو محصول باهم برابر هستند؟افراد دارای اضافه وزن باید از کدام محصول استفاده کنند
        if(f1.getCalories()==f2.getCalories())
        {
            System.out.println("The calories of the two products are the same");
        }
        else
        {
            System.out.println("The calories of the two products are not the same");
        }
        if(f1.getCalories() > f2.getCalories())
        {
            System.out.println("overweight people should use the second food product");
        }
        else
        {
            System.out.println("overweight people should use the first food product");
        }

//کلیه اطلاعات دو محصول را چاپ کنید
        System.out.println("Information about the first food product:");
        f1.print();

        System.out.println("Information about the second food product:");
        f2.print();

//nextClass:

        System.out.print("enter n: ");
        int n=sc.nextInt();
        Student []s = new Student[n];
        for(int i=0; i<n; i++)
        {
            s[i]=new Student();
            System.out.print("enter firstname:");
            String fisrtname=sc.nextLine();
            s[i].setFirstname(fisrtname);
            s[i].setFirstname(sc.nextLine());
            System.out.print("enter lastname:");
            String lastname=sc.nextLine();
            s[i].setLastname(lastname);

            System.out.print("enter fieldofstudy:");
            String fieldofstudy=sc.nextLine();
            s[i].setFieldofstudy(fieldofstudy);

            System.out.print("enter gender:");
            String gender=sc.nextLine();
            s[i].setGender(gender);

            System.out.print("enter address:");
            String address=sc.nextLine();
            s[i].setAddress(address);


            System.out.print("enter phonenumber:");
            int phonenumber= sc.nextInt();
            s[i].setPhonenumber(phonenumber);


            System.out.print("enter studentID:");
            int studentID= sc.nextInt();
            s[i].setStudentID(studentID);



            System.out.print("enter the birth day: ");
            day=sc.nextInt();

            System.out.print("enter the birth month: ");
            month=sc.nextInt();

            System.out.print("enter the birth year: ");
            year=sc.nextInt();

            Date db = new Date(day, month, year);
            s[i].setBirth(db);

            System.out.print("enter number of lessons: ");
            int numberoflessons= sc.nextInt();
            float []arr=new float[numberoflessons];
                 for(int j=0; j<numberoflessons; j++)
                 {
                     System.out.print("enter score: ");
                     arr[j]=sc.nextFloat();
                 }
                 float sum=0;
                 float avg;
                 for(int j=0; j<numberoflessons; j++)
                 {
                     sum=sum+arr[j];
                 }
            avg=sum/numberoflessons;
            s[i].setAvg(avg);
//تعداد درس های پاس شده و افتاده هر دانشجو را مشخص کنید
            int pass=0;
            int fail=0;
            for(int j=0; j<numberoflessons; j++)
            {
                if(arr[j]>=10 && arr[j]<=20)
                    pass++;
                if(arr[j]>=0 && arr[j]<10)
                    fail++;
            }
            s[i].setPass(pass);
            s[i].setFail(fail);

            System.out.println("tetad daneshjo ejad shode:"+ s[i].getNum());


            System.out.println("Student Info: ");
            s[i].print();

        }
//اطلاعات دانشجو با بالاترین معدل را چاپ کنید
        Student maxavg=s[0];
        for(int i=0; i<n; i++)
        {
            if(s[i].getAvg()>maxavg.getAvg())
                maxavg=s[i];
        }
        System.out.println("info max average student:");
        maxavg.print();
//تعداد دانشجویان با معدل الف رو چاپ کنید
        int alef = 0;
        for(int i=0; i<n; i++)
        {
            if (s[i].getAvg() > 17 && s[i].getAvg() < 20)
                alef++;
        }
        System.out.print("tedad avg top:"+alef);

    }

}
