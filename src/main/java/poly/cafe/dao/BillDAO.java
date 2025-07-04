/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.cafe.dao;

import java.util.Date;
import java.util.List;
import poly.cafe.entity.Bill;

public interface BillDAO extends CrudDao<Bill, Long> {

    List<Bill> findByUsername(String username);

    List<Bill> findByCardId(Integer cardId);

    //LAB 4: bổ sung
    List<Bill> findByTimeRange(Date begin, Date end);
//LAB 6: SALSEJDIALOG- bổ sung

    public Bill findServicingByCardId(Integer cardId);
//LAB 6: HISTORYJDIALOG- bổ sung

    List<Bill> findByUserAndTimeRange(String username, Date begin, Date end);

}
