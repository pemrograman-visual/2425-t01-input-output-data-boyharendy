// 12S24016 - Boy Harendy Simamora
// 12S24055 - Theresia Samosir

import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;

        iSBN = input.nextLine();
        String jUDUL;

        jUDUL = input.nextLine();
        String pENULIS;

        pENULIS = input.nextLine();
        int tAHUNTERBIT;

        tAHUNTERBIT = Integer.parseInt(input.nextLine());
        String pENERBIT;

        pENERBIT = input.nextLine();
        String fORMATBUKU;

        fORMATBUKU = input.nextLine();
        double hARGABELI;

        hARGABELI = Double.parseDouble(input.nextLine());
        double mINIMUMMARGIN;

        mINIMUMMARGIN = Double.parseDouble(input.nextLine());
        int sTOK;

        sTOK = Integer.parseInt(input.nextLine());
        double rATING;

        rATING = Double.parseDouble(input.nextLine());
        System.out.println(iSBN + "|" + jUDUL + "|" + pENULIS + "|" + tAHUNTERBIT + "|" + pENERBIT + "|" + fORMATBUKU + "|" + hARGABELI + "|" + mINIMUMMARGIN + "|" + sTOK + "|" + rATING);
    }
}
