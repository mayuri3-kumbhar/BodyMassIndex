package com.perennial.bodymassindex.service;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class BMIService {
    //Logger logger =  (Logger)LoggerFactory.getLogger(BMIService.class);


    public double bodyMassIndex(double height,double weight)
    {
        double BMI = weight / (height * height);
        return BMI;

//        if(height==0 || weight==0)
//        {
//            logger.info("value should not be 0");
//        }



//        if(BMI<18.5)
//        {
//
//            logger.info("weight is underweight");
//            return BMI;
//
//
//        }else if(BMI>18.5 && BMI<25)
//        {
//            logger.info("normal");
//            return BMI;
//        }else if(BMI>25 && BMI<30){
//           logger.info("you are overweight"); return BMI;
//        }else{
//            logger.info("obese");
//            return BMI;
//        }


    }
}
