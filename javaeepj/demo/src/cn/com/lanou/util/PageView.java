package cn.com.lanou.util;

import java.util.List;


/**
 * //分页封装函数
 * @param <T>
 */
@SuppressWarnings("unchecked")
public class PageView {
	/**
	 * 分页数据
	 */
	private List records;
	
	/**
	 * 总页数
	 * 这个数是计算出来的
	 * 
	 */
	private long pageCount;


	/**
	 * 每页显示几条记录
	 */
	private int pageSize = 1;


	/**
	 *默认 当前页 为第一页
	 *这个数是计算出来的
	 */
	private int pageNow = 1;

	/**
	 * 总记录数
	 */
	private long rowCount;

	public List getRecords() {
		return records;
	}

	public void setRecords(List records) {
		this.records = records;
	}

	public long getPageCount() {
		return pageCount;
	}

	public void setPageCount(long pageCount) {
		this.pageCount = pageCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public long getRowCount() {
		return rowCount;
	}

	public void setRowCount(long rowCount) {
		this.rowCount = rowCount;
	}
	
}
