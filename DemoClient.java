import java.net.*;
class DemoClient
{
    public static void main(String args[])throws Exception
    {
        try{
            Socket sk= new Socket("localhost",1223); //sending request to server,server will respond to this port number
             System.out.println("hello server I'm client");
           }
           catch(Exception e)
           { e.printStackTrace();}
    }
}