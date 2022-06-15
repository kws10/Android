// Generated by view binder compiler. Do not edit!
package com.example.res_list.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.res_list.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RestaurantDetailBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button menuBtn;

  @NonNull
  public final ImageView resDetailImg;

  @NonNull
  public final TextView resDetailName;

  private RestaurantDetailBinding(@NonNull RelativeLayout rootView, @NonNull Button menuBtn,
      @NonNull ImageView resDetailImg, @NonNull TextView resDetailName) {
    this.rootView = rootView;
    this.menuBtn = menuBtn;
    this.resDetailImg = resDetailImg;
    this.resDetailName = resDetailName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RestaurantDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RestaurantDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.restaurant_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RestaurantDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.menu_btn;
      Button menuBtn = ViewBindings.findChildViewById(rootView, id);
      if (menuBtn == null) {
        break missingId;
      }

      id = R.id.res_detail_img;
      ImageView resDetailImg = ViewBindings.findChildViewById(rootView, id);
      if (resDetailImg == null) {
        break missingId;
      }

      id = R.id.res_detail_name;
      TextView resDetailName = ViewBindings.findChildViewById(rootView, id);
      if (resDetailName == null) {
        break missingId;
      }

      return new RestaurantDetailBinding((RelativeLayout) rootView, menuBtn, resDetailImg,
          resDetailName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}