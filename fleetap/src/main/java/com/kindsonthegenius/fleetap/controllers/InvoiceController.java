package com.kindsonthegenius.fleetap.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindsonthegenius.fleetap.models.Invoice;
import com.kindsonthegenius.fleetap.services.ClientService;
import com.kindsonthegenius.fleetap.services.InvoiceStatusService;
import com.kindsonthegenius.fleetap.services.InvoiceService;
@Controller
public class InvoiceController {


	@Autowired	private InvoiceService invoiceService;
	@Autowired	private ClientService clientService;
	@Autowired	private InvoiceStatusService  invoiceStatusService;


	@GetMapping("/invoices")
	public String getInvoices(Model model) {		
		model.addAttribute("invoices", invoiceService.getInvoices());	
		
		model.addAttribute("clients", clientService.getClients());
		model.addAttribute("invoiceStatuses", invoiceStatusService.getInvoiceStatuses());
	
		return "Invoice";
	}	
	
	@PostMapping("/invoices/addNew")
	public String addNew(Invoice invoice) {
		invoiceService.save(invoice);
		return "redirect:/invoices";
	}
	
	@RequestMapping("invoices/findById")
	@ResponseBody
	public Optional<Invoice> findById(int id) {
	  return invoiceService.findById(id);	
	}	
	
	@RequestMapping(value="/invoices/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Invoice invoice) {
		invoiceService.save(invoice);
		return "redirect:/invoices";
	}
	
	@RequestMapping(value="/invoices/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		invoiceService.delete(id);
		return "redirect:/invoices";
	}
}


