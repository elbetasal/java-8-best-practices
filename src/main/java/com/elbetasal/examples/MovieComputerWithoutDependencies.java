package com.elbetasal.examples;

public class Movie {

    public Movie(Type type) {
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
                return days * 3;
            }
        };

        public abstract int computePrice(int days);
    }

    private final Type type;

    public int computePrice(int days){
        return type.computePrice(days);

    }


    public static void main(String[] args) {
        System.out.println(new Movie(Type.REGULAR).computePrice(1));
        System.out.println(new Movie(Type.CHILD).computePrice(1));
    }


}
