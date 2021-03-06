/*
 The MIT License (MIT)

    Copyright (c) 2015 Asylbek Isakov
    Modifications Copyright(C) 2016 Fred Grott(GrottWorkShop)

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.

 */
package com.github.shareme.greenandroid.arcanimator;

import android.view.View;


class Utils {

    public static float sin(double degree){
        return (float) Math.sin(Math.toRadians(degree));
    }

    public static float cos(double degree){
        return (float) Math.cos(Math.toRadians(degree));
    }

    public static float asin(double value){
        return (float) Math.toDegrees(Math.asin(value));
    }

    public static float acos(double value){
        return (float) Math.toDegrees(Math.acos(value));
    }

    public static float centerX(View view){
        return view.getX() + view.getWidth()/2;
    }

    public static float centerY(View view){
        return view.getY() + view.getHeight()/2;
    }

}
