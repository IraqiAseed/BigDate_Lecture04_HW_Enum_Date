# BigDate_Lecture04_HW_Enum_Date
1.the importance use of enum. 
2.date


  
1. enum Question:

Given:
package enums.homework;

public class HttpCodeHandler {

    public void handleHttpCode(int httpCode) {
        //todo refactor and finish this method without using even one if statement

        if (httpCode > 100 && httpCode < 199) {
            System.out.println("40 lines of code is working in order to handle informational status");
        }
        if (httpCode > 200 && httpCode < 299) {
            System.out.println("35 lines of code is working in order to handle success status");
        }
        ///...


    }
}

2. Date Questions:

1. write a method which take 2 params Dates in string format and return difference in days between them "yyyy-mm-dd"

2. write a method which takes a sting in format yyyy-dd-mm and return string in format yyyy-mm-dd
