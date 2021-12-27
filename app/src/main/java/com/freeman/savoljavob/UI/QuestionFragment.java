package com.freeman.savoljavob.UI;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.freeman.savoljavob.R;
import com.freeman.savoljavob.databinding.QuestionFragmentLayoutBinding;

public class QuestionFragment extends Fragment {
    QuestionFragmentLayoutBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.question_fragment_layout,container,false);
        binding=QuestionFragmentLayoutBinding.bind(view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.viewPagerContainer.setAdapter(new QuestionPageAdapter(getActivity().getSupportFragmentManager(), getViewLifecycleOwner().getLifecycle()));
        binding.backQuestion.setOnClickListener(view1 -> {
            if (binding.viewPagerContainer.getCurrentItem()-1>=0){
                binding.viewPagerContainer.setCurrentItem(binding.viewPagerContainer.getCurrentItem()-1);
            }
        });
        binding.nextQuestion.setOnClickListener(view1 -> {
            if (binding.viewPagerContainer.getCurrentItem()+1<=5){
                binding.viewPagerContainer.setCurrentItem(binding.viewPagerContainer.getCurrentItem()+1);
            }
        });
    }
}
