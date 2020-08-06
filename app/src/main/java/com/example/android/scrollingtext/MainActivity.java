/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.scrollingtext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * This app displays a scrollable TextView (a magazine article).
 * All changes were made to the layout. No code changes.
 * The code below is part of the Empty Activity template.
 */

public class MainActivity extends AppCompatActivity {
    private TextView sHeading, sTitle, sSubtitle;
    private ImageView sImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sHeading = (TextView) findViewById(R.id.article_heading);
        sTitle = (TextView) findViewById(R.id.article_subheading);
        sSubtitle = (TextView) findViewById(R.id.article1);
        sImg = (ImageView) findViewById(R.id.ivDetailPhoto);
    }

    public void sports(View view){
        sHeading.setText(R.string.article_title1);
        sTitle.setText(R.string.article_subtitle1);
        sSubtitle.setText(R.string.article_text1);
        sImg.setImageResource(R.drawable.uiux);
    }

    public void pariwisata(View view){
        sHeading.setText(R.string.article_title2);
        sTitle.setText(R.string.article_subtitle2);
        sSubtitle.setText(R.string.article_text2);
        sImg.setImageResource(R.drawable.koruptor);
    }

    public void kesehatan(View view){
        sHeading.setText(R.string.article_title3);
        sTitle.setText(R.string.article_subtitle3);
        sSubtitle.setText(R.string.article_text3);
        sImg.setImageResource(R.drawable.ighalo);
    }
}
