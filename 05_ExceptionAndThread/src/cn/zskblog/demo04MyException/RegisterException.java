package cn.zskblog.demo04MyException;
/****************************************************************************
* Package:cn.zskblog.demo04MyException                                                                                        
* Author:ZhangShiKang                                                       
* Email: 845664960@qq.com                                                       
* Created: 2020/9/25  20:04                                
* Version: 1.0                                                              
* Description:
 *          自定义异常类
*****************************************************************************/

public class RegisterException extends RuntimeException{
    // 运行期异常可以交给JVM处理，但Exception必须 throws 或 try c处理
    public RegisterException(){
        super();
    }

    public RegisterException(String message){
        super(message);
    }
                                             
    
}
