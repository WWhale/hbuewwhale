package cn.com.lanou.domain;

import java.util.List;

/**
 * 分页对象
 * @author Administrator
 *
 */
public class PageView {
	//分页数据主体
	private List records;
	
	//总记录数
	private long rowCount;
	
	//每页显示条数
	private int pageSize = 10;
	
	//总页数
	private long pageCount;
	
	//当前页
	private long pageNow = 1l;

	public List getRecords() {
		return records;
	}

	public void setRecords(List records) {
		this.records = records;
	}

	public long getRowCount() {
		return rowCount;
	}

	public void setRowCount(long rowCount) {
		this.rowCount = rowCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getPageCount() {
		return pageCount;
	}

	public void setPageCount(long pageCount) {
		this.pageCount = pageCount;
	}

	public long getPageNow() {
		return pageNow;
	}

	public void setPageNow(long pageNow) {
		this.pageNow = pageNow;
	}
}
