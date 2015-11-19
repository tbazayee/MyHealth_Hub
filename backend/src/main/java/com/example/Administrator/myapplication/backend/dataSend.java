package com.example.Administrator.myapplication.backend;

/**
 * The object model for the data we are sending through endpoints
 */
public class dataSend {

    private String myData;
    private float timeStamp,x,y,z;

    public float[] getEkgData(){
        float [] data = new float[4];
        data [0]= timeStamp;
        data [1]= x;
        data [2]= y;
        data [3]= z;
        return data;
    }
    public void setTimestamp(float time)
    {
        timeStamp = time;
    }
    public void setX(float x1)
    {
        x = x1;
    }
    public void setY(float y1)
    {
        y = y1;
    }
    public void setZ(float z1)
    {
        z = z1;
    }

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}