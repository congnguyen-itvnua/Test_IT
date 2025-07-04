/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.cafe.dao;

import java.util.List;
import poly.cafe.entity.BillDetail;

public interface BillDetailDAO extends CrudDao<BillDetail, Long> {

    List<BillDetail> findByBillId(Long billId);

    List<BillDetail> findByDrinkId(String drinkId);
}
