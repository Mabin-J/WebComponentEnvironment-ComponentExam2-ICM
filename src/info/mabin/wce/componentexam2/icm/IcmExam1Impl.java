package info.mabin.wce.componentexam2.icm;

import info.mabin.wce.manager.icm.IcmImpl;
import info.mabin.wce.manager.icm.exception.IcmException;

public interface IcmExam1Impl extends IcmImpl{
	public int sum(int param1, int param2) throws IcmException;
	public String getVersionName() throws IcmException;
	public Long getVersionCode() throws IcmException;
}
