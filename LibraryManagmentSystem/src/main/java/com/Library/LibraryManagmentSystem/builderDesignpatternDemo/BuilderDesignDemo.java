package com.Library.LibraryManagmentSystem.builderDesignpatternDemo;

/*
we will have to multiple constructor to solve this permutation and combination things
also order bhi yaad rakhna hai
jo jab lot of parameter hota hai to dikkat hoti hai(10 15) that case little bit complex ush case main order
yaad karna dikka hai
ush case hm aishe object create nahi karenge jaise karte the
 */

//@Getter
//@Setter
public class BuilderDesignDemo {
    private int id;
    private String name;
    private String city;
    private String pincode;
    private String street;
    // agar hme ishka object create karna hai to hame sab ka value ko populate karna padega
    // let say hame 3 object ko hi fill karna hai out of five
    // this case we will create a builder class and jo bhi hm pass kiya hai ushko ushme daal denge like this
    public BuilderDesignDemo(Builder builder){
        this.id=builder.id;
        this.name=builder.name;
        this.city=builder.city;
        this.pincode=builder.pincode;
        this.street=builder.street;
    }
    public static class Builder{
        private int id;
        private String name;
        private String city;
        private String pincode;
        private String street;
        // it will have a default constructor

        // this is method chaining type
        // setter
        public Builder setId(int id){
            this.id=id;
            return this;
        }
        public Builder setName(String name){
            this.name=name;
            return this;
        }
        public Builder setCity(String city){
            this.city=city;
            return this;
        }
        public Builder setPincode(String pincode){
            this.pincode=pincode;
            return this;
        }
        public Builder setStreet(String street){
            this.street=street;
            return this;
        }

        public BuilderDesignDemo build(){
            return new BuilderDesignDemo(this);
            /*
            build method is needed so  this builder class that is basiclayy npot rhe class that the client is
            interacting with so we can convert in to builder desing pattern class because cline tish se interact karega
             at end of the day mera clinet shirf ye hiu use karega builder design demo wala class

             jo bhi property hm builder design demo class main provide kiye hai wo copy kar dega this object
             */
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
