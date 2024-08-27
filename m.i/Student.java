public class Student
{
    private static int num;
    private String firstname;
    private String lastname;
    private String fieldofstudy;
    private String gender;
    private String address;
    private int phonenumber;
    private int studentID;
    private int pass;
    private int fail;
    private float avg;
    private Date birth;


    public Student()
    {
        num++;
        firstname=null;
        lastname=null;
        fieldofstudy=null;
        gender=null;
        address=null;
        phonenumber=0;
        studentID=0;
        pass=0;
        fail=0;
        avg=0;
        birth=null;
    }

    public Student(String firstname,String lastname,String fieldofstudy,String gender,String address,int phonenumber,int studentID,int pass,int fail,float avg,Date birth)
    {
        num++;
        this.firstname = firstname;
        this.lastname=lastname;
        this.fieldofstudy=fieldofstudy;
        this.gender=gender;
        this.address=address;
        this.phonenumber=phonenumber;
        this.studentID=studentID;
        this.pass=pass;
        this.fail=fail;
        this.avg=avg;
        this.birth = birth;
    }


    public static int getNum()
    {
        return num;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }
    public String getFirstname()
    {
        return firstname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }
    public String getLastname()
    {
        return lastname;
    }

    public void setFieldofstudy(String fieldofstudy)
    {
        this.fieldofstudy = fieldofstudy;
    }
    public String getFieldofstudy()
    {
        return fieldofstudy;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public String getGender()
    {
        return gender;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getAddress()
    {
        return address;
    }

    public void setPhonenumber(int phonenumber)
    {
        this.phonenumber = phonenumber;
    }
    public int getPhonenumber()
    {
        return phonenumber;
    }

    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }
    public int getStudentID()
    {
        return studentID;
    }

    public void setPass(int pass)
    {
        this.pass = pass;
    }
    public int getPass()
    {
        return pass;
    }

    public void setFail(int fail)
    {
        this.fail = fail;
    }
    public int getFail()
    {
        return fail;
    }

    public void setAvg(float avg)
    {
        this.avg = avg;
    }
    public float getAvg()
    {
        return avg;
    }

    public void setBirth(Date birth)
    {
        this.birth = birth;
    }
    public Date getBirth()
    {
        return birth;
    }

    public void print()
    {
        System.out.println("firstname is:"+firstname);
        System.out.println("lastname is:"+lastname);
        System.out.println("fieldofstudy is:"+fieldofstudy);
        System.out.println("gender is:"+gender);
        System.out.println("address is:"+address);
        System.out.println("phonenumber is:"+phonenumber);
        System.out.println("studentID is:"+studentID);
        System.out.println("the number of passes:"+pass);
        System.out.println("the number of falled:"+fail);
        System.out.println("avrage:"+avg);
        birth.print();
    }


}
