package com.github.shareme.greenandroid.materialdrawer.model;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.github.shareme.greenandroid.fastadapter.IItem;
import com.github.shareme.greenandroid.fastadapter.utils.ViewHolderFactory;
import com.github.shareme.greenandroid.materialdrawer.R;
import com.github.shareme.greenandroid.materialize.util.UIUtils;

import java.util.List;

/**
 * Created by mikepenz on 03.02.15.
 */
public class DividerDrawerItem extends AbstractDrawerItem<DividerDrawerItem, DividerDrawerItem.ViewHolder> {
    @Override
    public int getType() {
        return R.id.material_drawer_item_divider;
    }

    @Override
    @LayoutRes
    public int getLayoutRes() {
        return R.layout.material_drawer_item_divider;
    }

    @Override
    public void bindView(ViewHolder viewHolder, List payloads) {
        Context ctx = viewHolder.itemView.getContext();

        //set the identifier from the drawerItem here. It can be used to run tests
        viewHolder.itemView.setId(hashCode());

        //define how the divider should look like
        viewHolder.view.setClickable(false);
        viewHolder.view.setEnabled(false);
        viewHolder.view.setMinimumHeight(1);
        ViewCompat.setImportantForAccessibility(viewHolder.view,
                ViewCompat.IMPORTANT_FOR_ACCESSIBILITY_NO);

        //set the color for the divider
        viewHolder.divider.setBackgroundColor(UIUtils.getThemeColorFromAttrOrRes(ctx, R.attr.material_drawer_divider, R.color.material_drawer_divider));

        //call the onPostBindView method to trigger post bind view actions (like the listener to modify the item if required)
        onPostBindView(this, viewHolder.itemView);
    }

    @Override
    public void unbindView(ViewHolder holder) {

    }

    @Override
    public ViewHolderFactory<ViewHolder> getFactory() {
        return new ItemFactory();
    }

    @Override
    public IItem getParent() {
        return null;
    }

    @Override
    public Object withParent(IItem parent) {
        return null;
    }

    public static class ItemFactory implements ViewHolderFactory<ViewHolder> {
        public ViewHolder create(View v) {
            return new ViewHolder(v);
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private View view;
        private View divider;

        private ViewHolder(View view) {
            super(view);
            this.view = view;
            this.divider = view.findViewById(R.id.material_drawer_divider);
        }
    }
}
