// The Person class definition
public class Person
{
   // Private member variables
   private String name;
   private String address;
   private String phone;

   // Constructors
   public Person()
   {
      name = "";
      address = "";
      phone = "";
   }

   public Person( String name, String address, String phone )
   {
      this.name = name;
      this.address = address;
      this.phone = phone;
   }

   // Public getter and setter for private variables
   public void setName( String name )
   {
      this.name = name;
   }

   public void setAddress( String address )
   {
      this.address = address;
   }

   public void setPhone( String phone )
   {
      this.phone = phone;
   }
   
   public String getName()
   {
      return name;
   }

   public String getAddress()
   {
      return address;
   }

   public String getPhone()
   {
      return phone;
   }

   // Override toString() method
   public String toString() {
      return name + "\n" + address + "\n" + phone + "\n";
   }
}
