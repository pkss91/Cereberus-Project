package vib.track.cerberus.settings_activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import vib.track.cerberus.R;
import vib.track.cerberus.databinding.FragmentWristbandSettingsBinding;

public class wristband_settings extends Fragment {

    private FragmentWristbandSettingsBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentWristbandSettingsBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Back button to Settings Page
        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(wristband_settings.this)
                        .navigate(R.id.action_wristband_settings_to_SecondFragment);
            }
        });

        // Light Settings Page
        binding.buttonLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(wristband_settings.this)
                        .navigate(R.id.action_wristband_settings_to_light_settings);
            }
        });

        // Vibration Settings Page
        binding.buttonVibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(wristband_settings.this)
                        .navigate(R.id.action_wristband_settings_to_vibrate_settings);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}