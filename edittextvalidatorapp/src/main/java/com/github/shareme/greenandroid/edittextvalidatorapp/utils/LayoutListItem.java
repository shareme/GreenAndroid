package com.github.shareme.greenandroid.edittextvalidatorapp.utils;

import android.content.Context;

import com.github.shareme.greenandroid.edittextvalidatorapp.LayoutExampleActivity;


public class LayoutListItem extends ListItem {
	private int layoutRes;
	private int explanationString;

	public LayoutListItem(String _listString, int _layoutRes, int _explanationStringRes) {
		super(_listString);
		layoutRes = _layoutRes;
		explanationString = _explanationStringRes;
	}

	public void goToDemo(Context ctx) {
		ctx.startActivity(LayoutExampleActivity.buildIntent(ctx, getListTitle(), layoutRes, explanationString));
	}

}
