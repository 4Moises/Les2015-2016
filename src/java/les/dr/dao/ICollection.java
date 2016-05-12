/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les.dr.dao;

import java.util.List;

interface ICollection<T> {
    boolean add(T a);
    boolean rem(T a);
    T find(T a);
    List<T> list();

}
