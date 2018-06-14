package com.elbetasal.examples;

import static com.elbetasal.examples.MovieCatalogWithEnumMethods.Type.*;

public class MovieCatalogWithEnumMethods {

    public MovieCatalogWithEnumMethods(Type type) {
        this.type = type;
    }

    enum Type{
        REGULAR {
            @Override
            public int computePrice(int days) {
                return days * 2;
            }
        },
        CHILD{
            @Override
            public int computePrice(int days) {
                return 5;
            }
        };

        public abstract int computePrice(int days);
    }

    private final Type type;

    public int computePrice(int days){
        return type.computePrice(days);

    }


    public static void main(String[] args) {
        System.out.println(new MovieCatalogWithEnumMethods(REGULAR).computePrice(1));
        System.out.println(new MovieCatalogWithEnumMethods(CHILD).computePrice(1));
    }


}
