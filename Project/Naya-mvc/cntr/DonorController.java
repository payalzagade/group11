package cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import Bean.Donor_Request;
import dao.DonorDao;
import dao.UserDao;
import dto.User;

@Controller
public class DonorController {
	@Autowired
	private DonorDao donorDao;

	@RequestMapping(value = "/donorFoodRequest.htm")
	public String createf(Donor_Request donor,ModelMap model) {
		if(donor.getFoodDescription()==null || donor.getFoodQuantity() == 0 || donor.getCookTime()==0)
		{
			model.put("donor", new Donor_Request());
			return "Donor";
		}
		donor.setCategoryId(1);
		donorDao.createDonor(donor);
		model.put("donor1", new Donor_Request());
		return "BookDonor";
	}
	@RequestMapping(value = "/donorFoodSkip.htm")
	public String SkipFood(ModelMap model) {
		model.put("donor1", new Donor_Request());
		return "BookDonor";
	}
	
	@RequestMapping(value = "/donorBookSkip.htm")
	public String SkipBook(ModelMap model) {
		model.put("donor2", new Donor_Request());
		return "ClothsDonor";
	}
	
	@RequestMapping(value = "/donorClothSkip.htm")
	public String SkipCloth(Donor_Request donor) {
		return "BookDonor";
	}

	@RequestMapping(value = "/donorBookRequest.htm")
	public String createb(Donor_Request donor,ModelMap model) {
		if(donor.getBookDescription()==null || donor.getBookQuantity() == 0)
		{
			model.put("donor1", new Donor_Request());
			return "BookDonor";
		}
		donor.setCategoryId(2);
		donorDao.createDonor(donor);
		model.put("donor2", new Donor_Request());
		return "ClothsDonor";
	}

	@RequestMapping(value = "/donorClothRequest.htm")
	public String createc(Donor_Request donor,ModelMap model) {
		if(donor.getClothDescription()==null || donor.getClothQuantity() == 0)
		{
			model.put("donor2", new Donor_Request());
			return "ClothsDonor";
		}
		donor.setCategoryId(3);
		donorDao.createDonor(donor);
		return "success";
	}
}
