package ganavi.Dlithe;
import java.util.Arrays;
	// business class/ Model class
	public class Assembly
	{
		private Integer assemblyNumber, assemblyPopulation;
		private String assemblyName, assemblyMemberName;
		private String[] assemblyIssues;
		private Long assemblyContact;

		public Assembly() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Assembly(Integer assemblyNumber, Integer assemblyPopulation, String assemblyName, String assemblyMemberName,
				String[] assemblyIssues, Long assemblyContact) {
			super();
			this.assemblyNumber = assemblyNumber;
			this.assemblyPopulation = assemblyPopulation;
			this.assemblyName = assemblyName;
			this.assemblyMemberName = assemblyMemberName;
			this.assemblyIssues = assemblyIssues;
			this.assemblyContact = assemblyContact;
		}

		@Override
		public String toString() {
			return "Assembly [assemblyNumber=" + assemblyNumber + ", assemblyPopulation=" + assemblyPopulation
					+ ", assemblyName=" + assemblyName + ", assemblyMemberName=" + assemblyMemberName + ", assemblyIssues="
					+ Arrays.toString(assemblyIssues) + ", assemblyContact=" + assemblyContact + "]";
		}

		public Integer getAssemblyNumber() {
			return assemblyNumber;
		}
		public void setAssemblyNumber(Integer assemblyNumber) {
			this.assemblyNumber = assemblyNumber;
		}
		public Integer getAssemblyPopulation() {
			return assemblyPopulation;
		}
		public void setAssemblyPopulation(Integer assemblyPopulation) {
			this.assemblyPopulation = assemblyPopulation;
		}
		public String getAssemblyName() {
			return assemblyName;
		}
		public void setAssemblyName(String assemblyName) {
			this.assemblyName = assemblyName;
		}
		public String getAssemblyMemberName() {
			return assemblyMemberName;
		}
		public void setAssemblyMemberName(String assemblyMemberName) {
			this.assemblyMemberName = assemblyMemberName;
		}
		public String[] getAssemblyIssues() {
			return assemblyIssues;
		}
		public void setAssemblyIssues(String[] assemblyIssues) {
			this.assemblyIssues = assemblyIssues;
		}
		public Long getAssemblyContact() {
			return assemblyContact;
		}
		public void setAssemblyContact(Long assemblyContact) {
			this.assemblyContact = assemblyContact;
		}
	}

