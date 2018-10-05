package com.company;

public class Location {
    public int column;
    public int row;
    public double maxValue = 0;

    Location(int column, int row){
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] a){
        double maxValue = a[0][0];
        int rowMaxValue = 0;
        int columnMaxValue = 0;
        for(int row = 0; row < a.length; row++){
            for(int column = 0; column < a[row].length; column++){
              if(a[row][column] > maxValue){
                  maxValue = a[row][column];
                  rowMaxValue = row;
                  columnMaxValue = column;
              }
            }
        }
        Location location = new Location(rowMaxValue, columnMaxValue);
        location.setMaxValue(maxValue);
        return location;
    }

}
