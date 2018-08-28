package com.liuxv.twoshou.controller;

import com.liuxv.twoshou.po.Goods;
import com.liuxv.twoshou.po.User;
import com.liuxv.twoshou.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * created by liuxv on 2018/5/27
 * email:liuxver444@gmail.com
 * qq:1369058574
 */

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;


    @RequestMapping("/showGoods")
    public String showGoods(Model model){

        List<Goods> goods=goodsService.findGoodsList();
        System.out.println( goods.size() );
        for(int i=0;i<goods.size();i++){
            if(goods.get( i ).getStatus()==2){
                goods.remove( i );
                i--;
            }
        }
        model.addAttribute( "goodsList",goods );
        return "goods/showGoods";
    }

    @RequestMapping("/findGoodsListByType")
    public String findGoodsListByType(@RequestParam("id") Integer id, String uname, Model model){

        System.out.println("user has in it."+uname+"1111111111111111111111111111111");

        List<Goods> goods=goodsService.findGoodsListByType( id );
        System.out.println( goods.size() );

        for(int i=0;i<goods.size();i++){
            System.out.println( goods.get( i ).getName()+":"+goods.get( i ).getStatus()+":"+goods.get( i ).getSeller() );
            if(goods.get( i ).getStatus()==2){
                goods.remove( i );
                i--;
            }
        }
        System.out.println( goods.size() );
        model.addAttribute( "goodsList",goods );
        model.addAttribute( "uname",uname);
        return "goods/showGoodsUser";
    }



    @RequestMapping("/write")
    public String write(String uname,Model model){
        System.out.println( "user:--------------"+uname);
        model.addAttribute( "uname",uname );
        return "goods/addGoods";
    }





    @RequestMapping("/insert")
    public String insert(String uname, Goods goods, MultipartFile goods_pic, Model model){



        //System.out.println( itemsCustom.getId() );
        //原始名称
        String originalFilename = goods_pic.getOriginalFilename();
        System.out.println( "3###########################################33" );

        System.out.println( uname );
        System.out.println( originalFilename );

        //上传图片
        if (goods_pic != null && originalFilename != null && originalFilename.length() > 0) {

            //存储图片的物理路径
            String pic_path = "C:\\programming\\springgit\\twoshou\\temp\\";

            //新的图片名称
           // String newFileName = user + goods.getName();
            String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));

            //新图片
            File newFile = new File(pic_path + newFileName);


            //将内存中的数据写入磁盘
            try {
                goods_pic.transferTo(newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }

            //将新图片名称写到itemsCustom中
            goods.setPic(newFileName);

        }
        System.out.println( "_______________##################________________"+goods.getName() );

        goods.setSeller( uname );
        goods.setStatus( 1 );
        //调用service更新商品信息，页面需要将商品信息传到此方法
        goodsService.insertGoods( goods );




        //goods.setStatus( 1 );
       // goodsService.insertGoods( goods );

        System.out.println( goods.getName()+":"+goods.getStatus()+ goods.getSeller());
        model.addAttribute( "name",uname );
        return "redirect:/user/backhome";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "name") String name, Model model){
        goodsService.deleteGoods( name );
        return "goods/showGoods";
    }

}
