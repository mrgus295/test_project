package dto;

/**
 * @author kimkh
 *
 */
public class ObjectDto {

	private int no;
	private String name;
	private int depthCd;
	private String depthNm;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepthCd() {
		return depthCd;
	}
	public void setDepthCd(int depthCd) {
		this.depthCd = depthCd;
	}
	public String getDepthNm() {
		return depthNm;
	}
	public void setDepthNm(String depthNm) {
		this.depthNm = depthNm;
	}
	@Override
	public String toString() {
		return "ObjectDto [no=" + no + ", name=" + name + ", depthCd=" + depthCd + ", depthNm=" + depthNm + "]";
	}

	
}
