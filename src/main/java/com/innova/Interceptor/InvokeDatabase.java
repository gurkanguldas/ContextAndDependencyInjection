package com.innova.Interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@InterceptorDatabase
public class InvokeDatabase {

	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) {

		boolean isLogin = false;
		Object isContinue = null;
		if (isLogin)
		{
			System.out.println("Connection Failed.");
			return null;
		}
		else
		{
			try
			{
				isContinue = context.proceed();
				System.out.println("Connection Successed.");
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		return isContinue;
	}
}
