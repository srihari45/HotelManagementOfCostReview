package hm.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import hm.base.HotelManage;
import hm.base.impl.HotelX;
import hm.base.impl.HotelY;
import hm.base.impl.HotelZ;

public class HotelManageDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Map<Integer, HotelManage> getPrice(Date date, String customer) {

		HotelManage hotelX = new HotelX().getHotelPrice(date, customer);
		HotelManage hotelY = new HotelY().getHotelPrice(date, customer);
		HotelManage hotelZ = new HotelZ().getHotelPrice(date, customer);

		List<HotelManage> hotelsList = new ArrayList<>();
		hotelsList.add(hotelX);
		hotelsList.add(hotelY);
		hotelsList.add(hotelZ);
		System.out.println("Hotels : " + hotelsList.size());
		Map<Integer, HotelManage> hotelsMap = new HashMap<>();

		for (HotelManage hotel : hotelsList) {

			Iterator itr = hotelsMap.entrySet().iterator();
			while (itr.hasNext()) {
				Entry<Integer, HotelManage> entry = (Entry<Integer, HotelManage>) itr.next();
				HotelManage hm = entry.getValue();
				if (Integer.parseInt(hotel.getFinalPrice()) == Integer.parseInt(hm.getFinalPrice())) {
					if (Integer.parseInt(hotel.getHotelRating()) < Integer.parseInt(hm.getHotelRating())) {
						hotel = hm;
					}
				} else if (Integer.parseInt(hotel.getFinalPrice()) > Integer.parseInt(hm.getFinalPrice())) {
					hotel = hm;
				}
				itr.remove();
			}
			hotelsMap.put(Integer.parseInt(hotel.getFinalPrice()), hotel);
		}
		return hotelsMap;
	}

	public static void main(String[] args) {
		Map<Integer, HotelManage> hotelsMap = getPrice(new Date(), "REGULAR");
		for (Map.Entry<Integer, HotelManage> entry : hotelsMap.entrySet()) {
			HotelManage hotel = entry.getValue();
			System.out.println("Price : " + hotel.getFinalPrice() + ", Rating : " + hotel.getHotelRating());
		}
	}
}
