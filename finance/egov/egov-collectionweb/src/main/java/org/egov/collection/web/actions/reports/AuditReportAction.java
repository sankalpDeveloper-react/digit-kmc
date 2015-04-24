package org.egov.erpcollection.web.actions.reports;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.egov.web.utils.ServletActionRedirectResult;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.egov.web.actions.BaseFormAction;

/**
 * 
 * @author subhash
 *
 */

@ParentPackage("egov")
@Result(name="auditReport",type=ServletActionRedirectResult.class,value="auditReport",params={"moduleName","COLLECTIONS","namespace","/egi/auditing","method","searchForm","actionName","auditReport","prependServletContext","false"})
public class AuditReportAction extends BaseFormAction{
	private static final long serialVersionUID = 1L;
	
	@SkipValidation
	public String search() {
	 return "auditReport";
	}

	
	@Override
	public Object getModel() {
		
		return null;
	}

}
