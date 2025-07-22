package day2ass;

	public class Product {
		private int pid;
		private String pname,pcity;
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public String getPcity() {
			return pcity;
		}
		public void setPcity(String pcity) {
			this.pcity = pcity;
		}
		@Override
		public String toString() {
			return "Product [pid=" + pid + ", pname=" + pname + ", pcity=" + pcity + "]";
		}
		
	}