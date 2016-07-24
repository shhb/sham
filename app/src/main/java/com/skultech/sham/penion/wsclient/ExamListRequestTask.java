package com.skultech.sham.penion.wsclient;

import android.util.Log;

import android.os.AsyncTask;
import com.skultech.sham.penion.domain.ExamInstanceModel;
import com.skultech.sham.penion.utils.Constants;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * Created by shhb on 2016-07-12.
 */
/// it's stilling under implemneting
    public class ExamListRequestTask extends AsyncTask<Void, Void, ExamInstanceModel> {
        @Override
        protected ExamInstanceModel doInBackground(Void... params) {
            try {
                final String url = Constants.BASE_URL + "/examinstance/listbyexamineeid/7";
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                ExamInstanceModel examInstance = restTemplate.getForObject(url, ExamInstanceModel.class);
                return examInstance;
            } catch (Exception e) {
                Log.e("MainActivity", e.getMessage(), e);
            }

            return null;
        }

    }


//'http://ec2-52-35-51-11.us-west-2.compute.amazonaws.com/exam/api/exam/list'