package com.fft.domain;


import javax.persistence.*;

@Entity

public class Item {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, updatable = false)
        private long id;


 @Column(name = "code", nullable = false, updatable = false, unique = true)
        private String inventoryCode;

 @Column(name = "type", nullable = false)
        private String type;

        public Item()
        {

        }

        public Item(String inventoryCode, String type)

        {

            this.inventoryCode = inventoryCode;
            this.type = type;

        }

  @Override
        public  String toString() {
            return "Item{" +
                    "id=" + id +
                    ", inventoryCode='" + inventoryCode + '\'' +
                    ", type='" + type + '\'' +
                    '}';
  }
}
