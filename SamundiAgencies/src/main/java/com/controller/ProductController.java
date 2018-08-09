package com.controller;

import java.security.Principal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.CompanyExpense;
import com.model.CompanyExpenseDAO;
import com.model.CounterClosing;
import com.model.CounterClosingDAO;
import com.model.IceBalanceDAO;
import com.model.Product;
import com.model.ProductDAO;
import com.model.RetailerClosing;
import com.model.RetailerClosingDAO;
import com.model.IceBalance;
import com.model.RetailerMgmt;
import com.model.RetailerMgmtDAO;

@Controller
public class ProductController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {

		ModelAndView view = new ModelAndView("index");
		view.addObject("HeaderName", "Welcome to Products Page");
		return view;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage() {

		ModelAndView mv = new ModelAndView("login");
		return mv;

	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index() {

		ModelAndView view = new ModelAndView("index");
		view.addObject("HeaderName", "Welcome to Products Page");
		return view;
	}

	@RequestMapping(value = "/Cmpny_Exp", method = RequestMethod.GET)
	public ModelAndView Cmpny_Exp() {

		ModelAndView view1 = new ModelAndView("Cmpny_Exp");
		return view1;
	}

	@RequestMapping(value = "/Report_Cmpny_Exp", method = RequestMethod.GET)
	public ModelAndView Edit_Cmpny_Exp() {

		ModelAndView view2 = new ModelAndView("Report_Cmpny_Exp");
		return view2;
	}

	@RequestMapping(value = "/Cmpny_Exp_submit")
	public ModelAndView Cmpny_Exp_submit(CompanyExpense CompanyExpense, Principal p) throws Exception {
		ModelAndView mv1 = new ModelAndView("Cmpny_Exp");
		CompanyExpenseDAO pd = new CompanyExpenseDAO();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();
		CompanyExpense.setDate(dtf.format(now));
		CompanyExpense.setUser(p.getName());
		pd.insertCompanyExpense(CompanyExpense);

		return mv1;
	}

	@RequestMapping(value = "/Report_Cmpny_Exp_Data")
	public ModelAndView Edit_Cmpny_Exp_data(HttpServletRequest request) throws Exception {
		ModelAndView mv3 = new ModelAndView("Report_Cmpny_Exp_Data");
		String fDate = request.getParameter("fDate");
		String tDate = request.getParameter("tDate");
		CompanyExpenseDAO ud = new CompanyExpenseDAO();
		List<CompanyExpense> lp = ud.getReport(fDate, tDate);
		mv3.addObject("lp", lp);
		return mv3;
	}

	@RequestMapping(value = "/CompanyExpense_edit")

	public ModelAndView editProducts(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		ModelAndView mv = new ModelAndView("CompanyExpense_edit");
		mv.addObject("u", CompanyExpenseDAO.findById(id));
		return mv;
	}

	@RequestMapping(value = "/CompanyExpense_edit_submit")
	public ModelAndView CompanyExpense_edit_submit(CompanyExpense CompanyExpense, Principal p) throws Exception {
		ModelAndView mv1 = new ModelAndView("Cmpny_Exp");
		CompanyExpenseDAO pd = new CompanyExpenseDAO();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();
		CompanyExpense.setDate(dtf.format(now));
		CompanyExpense.setUser(p.getName());
		pd.updateCompanyExpense(CompanyExpense);

		return mv1;
	}

	@RequestMapping(value = "/IceBalance", method = RequestMethod.GET)
	public ModelAndView IceBalance() {

		ModelAndView view3 = new ModelAndView("IceBalanceUpdate");
		RetailerMgmtDAO ud = new RetailerMgmtDAO();
		List<RetailerMgmt> lp = ud.getRetailerMgmts();
		view3.addObject("lp", lp);
		return view3;
	}

	@RequestMapping(value = "/RetailerUpload", method = RequestMethod.GET)
	public ModelAndView RetailerUpload() {

		ModelAndView view3 = new ModelAndView("RetailerUpload");
		return view3;
	}
	@RequestMapping(value = "/RetailerList", method = RequestMethod.GET)
	public ModelAndView RetailerList() {

		ModelAndView view3 = new ModelAndView("RetailerList");
		RetailerMgmtDAO ud = new RetailerMgmtDAO();
		List<RetailerMgmt> lp = ud.getRetailerMgmts();
		view3.addObject("lp", lp);
		return view3;
	}
	@RequestMapping(value = "/RetailerMgmtEdit", method = RequestMethod.GET)
	public ModelAndView RetailerMgmtEdit(HttpServletRequest request, Principal p) {

		int id = Integer.parseInt(request.getParameter("id"));
		ModelAndView view3 = new ModelAndView("RetailerMgmtEdit");
		view3.addObject("u", RetailerMgmtDAO.findById(id));
		return view3;
	}
	@RequestMapping(value = "/RetailerUploadSubmit")
	public ModelAndView RetailerUploadSubmit(RetailerMgmt RetailerMgmt, Principal p) throws Exception {
		ModelAndView mv1 = new ModelAndView("RetailerUpload");
		RetailerMgmtDAO pd = new RetailerMgmtDAO();
		RetailerMgmt.setUser(p.getName());
		pd.insertRetailerMgmt(RetailerMgmt);
		return mv1;
	}
	@RequestMapping(value = "/RetailerUploadEdit")
	public ModelAndView RetailerUploadEdit(RetailerMgmt RetailerMgmt, Principal p) throws Exception {
		ModelAndView mv1 = new ModelAndView("RetailerUpload");
		RetailerMgmtDAO pd = new RetailerMgmtDAO();
		RetailerMgmt.setUser(p.getName());
		pd.updateRetailerMgmt(RetailerMgmt);

		return mv1;
	}
	@RequestMapping(value = "/IceBalancesubmit")
	public ModelAndView IceBalancesubmit(IceBalance IceBalance, Principal p) throws Exception {
		ModelAndView mv1 = new ModelAndView("IceBalanceUpdate");
		IceBalanceDAO pd = new IceBalanceDAO();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();
		IceBalance.setDate(dtf.format(now));
		IceBalance.setUser(p.getName());
		pd.insertIceBalance(IceBalance);

		return mv1;
	}

	@RequestMapping(value = "/ReportIceBalanceFilter", method = RequestMethod.GET)
	public ModelAndView ReportIceBalanceFilter() {

		ModelAndView view2 = new ModelAndView("ReportIceBalanceFilter");
		return view2;
	}

	@RequestMapping(value = "/Report_IceBalance")
	public ModelAndView Report_IceBalance(HttpServletRequest request) throws Exception {
		ModelAndView mv3 = new ModelAndView("Report_IceBalance");
		String fDate = request.getParameter("fDate");
		String tDate = request.getParameter("tDate");
		IceBalanceDAO ud = new IceBalanceDAO();
		List<IceBalance> lp = ud.getReport(fDate, tDate);
		mv3.addObject("lp", lp);
		return mv3;
	}

	@RequestMapping(value = "/ReportIceBalanceEdit")

	public ModelAndView ReportIceBalanceEdit(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		ModelAndView mv = new ModelAndView("ReportIceBalanceEdit");
		mv.addObject("u", IceBalanceDAO.findById(id));
		return mv;
	}

	@RequestMapping(value = "/IceBalanceEdit")
	public ModelAndView IceBalanceEdit(IceBalance IceBalance, Principal p) throws Exception {
		ModelAndView mv1 = new ModelAndView("IceBalanceUpdate");
		IceBalanceDAO pd = new IceBalanceDAO();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();
		IceBalance.setDate(dtf.format(now));
		RetailerMgmtDAO ud = new RetailerMgmtDAO();
		List<RetailerMgmt> lp = ud.getRetailerMgmts();
		mv1.addObject("lp", lp);
		pd.updateIceBalance(IceBalance);
		return mv1;
	}
	@RequestMapping(value = "/ProductUpload", method = RequestMethod.GET)
	public ModelAndView ProductUpload() {

		ModelAndView view3 = new ModelAndView("ProductUpload");
		return view3;
	}
	@RequestMapping(value = "/ProductSubmit")
	public ModelAndView ProductSubmit(Product Product) throws Exception {
		ModelAndView mv1 = new ModelAndView("ProductUpload");
		ProductDAO pd = new ProductDAO();
		pd.insertProduct(Product);
		return mv1;
	}
	@RequestMapping(value = "/ProductUploadList", method = RequestMethod.GET)
	public ModelAndView ProductUploadList() {

		ModelAndView view3 = new ModelAndView("ProductUploadList");
		ProductDAO ud = new ProductDAO();
		List<Product> lp = ud.getProducts();
		view3.addObject("lp", lp);
		return view3;
	}
	@RequestMapping(value = "/ProductEdit", method = RequestMethod.GET)
	public ModelAndView ProductEdit(HttpServletRequest request, Principal p) {

		int id = Integer.parseInt(request.getParameter("id"));
		ModelAndView view3 = new ModelAndView("ProductEdit");
		view3.addObject("u", ProductDAO.findById(id));
		return view3;
	}
	@RequestMapping(value = "/ProductUploadEdit")
	public ModelAndView ProductUploadEdit(Product Product) throws Exception {
		ModelAndView mv1 = new ModelAndView("ProductUpload");
		ProductDAO pd = new ProductDAO();
		pd.updateProduct(Product);

		return mv1;
	}

	@RequestMapping(value = "/OpenCounterClosingUpload", method = RequestMethod.GET)
	public ModelAndView OpenCounterClosingUpload() {

		ModelAndView view3 = new ModelAndView("OpenCounterClosingUpload");
		ProductDAO ud = new ProductDAO();
		List<Product> lp = ud.getProducts();
		view3.addObject("lp", lp);
		return view3;
	}
	@RequestMapping(value = "/OpenCounterClosingSubmit")
	public ModelAndView OpenCounterClosingSubmit(CounterClosing CounterClosing,HttpServletRequest request, Principal p) throws Exception {
		ModelAndView mv1 = new ModelAndView("index");
		
		String[] names = CounterClosing.getName().split(",");
		String[] OpeningStocks = CounterClosing.getOpeningStock().split(",");
		String[] ClosingStocks = CounterClosing.getClosingStock().split(",");
		int i=-1;
		for (String name : names)
		{
		i++;	
		int os=Integer.parseInt(OpeningStocks[i]);
		int cs=Integer.parseInt(ClosingStocks[i]);
		int sold=os-cs;
		CounterClosingDAO pd = new CounterClosingDAO();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();
		CounterClosing.setDate(dtf.format(now));
		CounterClosing.setName(name);
		CounterClosing.setOpeningStock(OpeningStocks[i]);
		CounterClosing.setClosingStock(ClosingStocks[i]);
		CounterClosing.setSold(sold);
		pd.insertCounterClosing(CounterClosing);
		
		}
		return mv1;
	}
	@RequestMapping(value = "/CounterClosingUpload", method = RequestMethod.GET)
	public ModelAndView CounterClosingUpload() {

		ModelAndView view3 = new ModelAndView("CounterClosingUpload");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();
		String Date=dtf.format(now);
		CounterClosingDAO ud = new CounterClosingDAO();
		List<CounterClosing> lp = ud.getReportByDate(Date);
		view3.addObject("lp", lp);
		return view3;
	}
	@RequestMapping(value = "/CounterClosingSubmit")
	public ModelAndView CounterClosingSubmit(CounterClosing CounterClosing,HttpServletRequest request, Principal p) throws Exception {
		ModelAndView mv1 = new ModelAndView("index");
		
		String[] names = CounterClosing.getName().split(",");
		String[] OpeningStocks = CounterClosing.getOpeningStock().split(",");
		String[] ClosingStocks = CounterClosing.getClosingStock().split(",");
		int i=-1;
		for (String name : names)
		{
		i++;	
		int os=Integer.parseInt(OpeningStocks[i]);
		int cs=Integer.parseInt(ClosingStocks[i]);
		int sold=os-cs;
		CounterClosingDAO pd = new CounterClosingDAO();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();
		CounterClosing.setDate(dtf.format(now));
		CounterClosing.setName(name);
		CounterClosing.setOpeningStock(OpeningStocks[i]);
		CounterClosing.setClosingStock(ClosingStocks[i]);
		CounterClosing.setSold(sold);
		pd.insertCounterClosing(CounterClosing);
		
		}
		return mv1;
	}
	@RequestMapping(value = "/CounterClosingListByDate", method = RequestMethod.GET)
	public ModelAndView CounterClosingListByDate() {

		ModelAndView view3 = new ModelAndView("CounterClosingListByDate");
		return view3;
	}
	@RequestMapping(value = "/CounterClosingListByDateSubmit")
	public ModelAndView CounterClosingListByDateSubmit(HttpServletRequest request) {

		ModelAndView view3 = new ModelAndView("CounterClosingReport");
		String Date = request.getParameter("Date");
		CounterClosingDAO ud = new CounterClosingDAO();
		List<CounterClosing> lp = ud.getReportByDate(Date);
		view3.addObject("lp", lp);
		return view3;
	}
	@RequestMapping(value = "/CounterClosingListByPeriod")
	public ModelAndView CounterClosingListByPeriod() {

		ModelAndView view3 = new ModelAndView("CounterClosingListByPeriod");
		return view3;
	}
	@RequestMapping(value = "/CounterClosingListByPeriodSubmit")
	public ModelAndView CounterClosingListByPeriodSubmit(HttpServletRequest request) throws Exception {
		ModelAndView mv3 = new ModelAndView("CounterClosingReport");
		String fDate = request.getParameter("fDate");
		String tDate = request.getParameter("tDate");
		CounterClosingDAO ud = new CounterClosingDAO();
		List<CounterClosing> lp = ud.getReport(fDate, tDate);
		mv3.addObject("lp", lp);
		return mv3;
	}
	@RequestMapping(value = "/OpenRetailerClosingUpload", method = RequestMethod.GET)
	public ModelAndView OpenRetailerClosingUpload() {

		ModelAndView view3 = new ModelAndView("OpenRetailerClosingUpload");
		ProductDAO ud = new ProductDAO();
		List<Product> lp = ud.getProducts();
		view3.addObject("lp", lp);
		return view3;
	}
	@RequestMapping(value = "/OpenRetailerClosingSubmit")
	public ModelAndView OpenRetailerClosingSubmit(RetailerClosing RetailerClosing,HttpServletRequest request, Principal p) throws Exception {
		ModelAndView mv1 = new ModelAndView("index");
		
		String[] names = RetailerClosing.getName().split(",");
		String[] OpeningStocks = RetailerClosing.getOpeningStock().split(",");
		String[] ClosingStocks = RetailerClosing.getClosingStock().split(",");
		int i=-1;
		for (String name : names)
		{
		i++;	
		int os=Integer.parseInt(OpeningStocks[i]);
		int cs=Integer.parseInt(ClosingStocks[i]);
		int sold=os-cs;
		RetailerClosingDAO pd = new RetailerClosingDAO();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();
		RetailerClosing.setDate(dtf.format(now));
		RetailerClosing.setName(name);
		RetailerClosing.setOpeningStock(OpeningStocks[i]);
		RetailerClosing.setClosingStock(ClosingStocks[i]);
		RetailerClosing.setSold(sold);
		pd.insertRetailerClosing(RetailerClosing);
		
		}
		return mv1;
	}
	@RequestMapping(value = "/RetailerClosingUpload", method = RequestMethod.GET)
	public ModelAndView RetailerClosingUpload() {

		ModelAndView view3 = new ModelAndView("RetailerClosingUpload");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();
		String Date=dtf.format(now);
		RetailerClosingDAO ud = new RetailerClosingDAO();
		List<RetailerClosing> lp = ud.getReportByDate(Date);
		view3.addObject("lp", lp);
		return view3;
	}
	@RequestMapping(value = "/RetailerClosingSubmit")
	public ModelAndView RetailerClosingSubmit(RetailerClosing RetailerClosing,HttpServletRequest request, Principal p) throws Exception {
		ModelAndView mv1 = new ModelAndView("index");
		
		String[] names = RetailerClosing.getName().split(",");
		String[] OpeningStocks = RetailerClosing.getOpeningStock().split(",");
		String[] ClosingStocks = RetailerClosing.getClosingStock().split(",");
		int i=-1;
		for (String name : names)
		{
		i++;	
		int os=Integer.parseInt(OpeningStocks[i]);
		int cs=Integer.parseInt(ClosingStocks[i]);
		int sold=os-cs;
		RetailerClosingDAO pd = new RetailerClosingDAO();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();
		RetailerClosing.setDate(dtf.format(now));
		RetailerClosing.setName(name);
		RetailerClosing.setOpeningStock(OpeningStocks[i]);
		RetailerClosing.setClosingStock(ClosingStocks[i]);
		RetailerClosing.setSold(sold);
		pd.insertRetailerClosing(RetailerClosing);
		
		}
		return mv1;
	}
	@RequestMapping(value = "/RetailerClosingListByDate", method = RequestMethod.GET)
	public ModelAndView RetailerClosingListByDate() {

		ModelAndView view3 = new ModelAndView("RetailerClosingListByDate");
		return view3;
	}
	@RequestMapping(value = "/RetailerClosingListByDateSubmit")
	public ModelAndView RetailerClosingListByDateSubmit(HttpServletRequest request) {

		ModelAndView view3 = new ModelAndView("RetailerClosingReport");
		String Date = request.getParameter("Date");
		RetailerClosingDAO ud = new RetailerClosingDAO();
		List<RetailerClosing> lp = ud.getReportByDate(Date);
		view3.addObject("lp", lp);
		return view3;
	}
	@RequestMapping(value = "/RetailerClosingListByPeriod")
	public ModelAndView RetailerClosingListByPeriod() {

		ModelAndView view3 = new ModelAndView("RetailerClosingListByPeriod");
		return view3;
	}
	@RequestMapping(value = "/RetailerClosingListByPeriodSubmit")
	public ModelAndView RetailerClosingListByPeriodSubmit(HttpServletRequest request) throws Exception {
		ModelAndView mv3 = new ModelAndView("RetailerClosingReport");
		String fDate = request.getParameter("fDate");
		String tDate = request.getParameter("tDate");
		RetailerClosingDAO ud = new RetailerClosingDAO();
		List<RetailerClosing> lp = ud.getReport(fDate, tDate);
		mv3.addObject("lp", lp);
		return mv3;
	}

}
