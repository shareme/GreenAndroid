/*
 Copyright 2015 Satoru Fujiwara
 Modifications Copyright(C) 2016 Fred Grott(GrottWorkShop)

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

 */
package com.github.shareme.greenandroid.materialscrolling.behavior;

import android.support.v4.view.ViewCompat;
import android.view.View;

@SuppressWarnings("unused")
public class ParallaxBehavior extends ScrollBehavior {

    private final float parallaxRate;

    public ParallaxBehavior() {
        this(1.5f);
    }

    public ParallaxBehavior(final float parallaxRate) {
        this.parallaxRate = parallaxRate;
    }

    @Override
    protected void computeTranslation(final View target, final int scrollY, final int y) {
        ViewCompat.setTranslationY(target, -scrollY / parallaxRate);
    }
}
