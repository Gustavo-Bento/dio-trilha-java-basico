public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano) {
            case "B":
                System.out.println("100 minutos de ligação");
                break;
            case "M":
                System.out.println("100 minutos de ligação");
                System.out.println("WhatApp e Instagram gratis");
                break;
            case "T":
                System.out.println("100 minutos de ligação");
                System.out.println("WhatApp e Instagram gratis");
                System.out.println("5G e Youtube");
                break;
            default:
                break;
        }
    }
}
