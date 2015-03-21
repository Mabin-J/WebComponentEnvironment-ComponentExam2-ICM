package info.mabin.wce.componentexam2.icm;

import java.lang.reflect.Method;

import info.mabin.wce.manager.exception.IcmNotRegisteredException;
import info.mabin.wce.manager.icm.IcmAbstract;
import info.mabin.wce.manager.icm.exception.IcmException;

public class IcmExam1 extends IcmAbstract implements IcmExam1Impl{
	private Method methodSum, methodGetVersionName, methodGetVersionCode;
	
	
	public IcmExam1() throws IcmNotRegisteredException {
		super("info.mabin.wce.componentexam2.icm.IcmExam1");
		
		try {
			methodSum = this.getMethod("sum", new Class<?>[]{int.class, int.class});
			methodGetVersionName = this.getMethod("getVersionName");
			methodGetVersionCode = this.getMethod("getVersionCode");
		} catch (IcmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int sum(int param1, int param2) throws IcmException{
		try {
			return (Integer) this.invokeMethod(methodSum, param1, param2);
		} catch (IcmException e) {
			throw e;
		}
	}

	@Override
	public String getVersionName() throws IcmException {
		try {
			return (String) this.invokeMethod(methodGetVersionName);
		} catch (IcmException e) {
			throw e;
		}
	}

	@Override
	public Long getVersionCode() throws IcmException {
		try {
			return (Long) this.invokeMethod(methodGetVersionCode);
		} catch (IcmException e) {
			throw e;
		}
	}
}
