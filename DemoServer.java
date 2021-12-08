import java.net.*;
class DemoServer
{
    public static void main(String args[])throws Exception
    {  
        try{
        ServerSocket ss =new ServerSocket(1223);
        System.out.println("Server is waiting for the client..."); //server is listening on port number 1223
             Socket sk=ss.accept();
             System.out.println("connection established.....");
        } 
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}