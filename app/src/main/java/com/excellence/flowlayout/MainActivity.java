package com.excellence.flowlayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.excellence.flowlibrary.BGAFlowLayout;
import com.excellence.flowlibrary.FlowLayout;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
//	private String[] mLabels = { "��", "ҵ��", "��չ��Ҫ��", "����", "��Ҫ���ƿ���һ�����ѧϰ����Ʒ��", "�ն�ΪPAD��", "��Ҫ���", "�ֻ���", "APP", "����������APP��", "��", "ʵ��", "���", "��Ӫ���ԡ�", "��ƷӦ�÷�Χ�̳�����������", "�������ġ�", "���������ȣ�", "��Ҫ", "��",
//			"ѧϰ��", "�߱�", "�ҳ�����", "Ӧ���̳ǡ�", "����������ʾ��", "�������ġ�", "�������Եȹ���" };

	private String[] mLabels = { "��ˮ΢��", "�ƾ�����", "��", "��������������Ʈ��", "��������", "��Ů�Ӹɾ���΢Ц", "�����", "����������", "----���", "һ����", "վ�������", "����Ӱ���", "����������", "������ϼ", "��ô�����", "����Բ�", "��¶Ϊ˪", "��ν����", "��ˮһ��",
			"��䧴�֮", "�����ҳ�", "���δ�֮", "����ˮ����", "�����ļ���", "����������", "�����Ļ���", "��Լ����̬", "һ�������������", "����ɷ�����", "����ˮ�е�����", "������Ҷ��ľ���", "Ů������", "���ѽ", "Ů��֮��", "��������", "һ����Ҫ������", "Ů�ӵ�����", "������", "һ����������������֮��",
			"һ����������֮��", "����֮��", "��ָ��һ��Ů������֮��", "��֮ܰ��", "������", "ָ��һ��Ů�ӵ���ò֮��", "�����������Ӿ����۹�", "���ڵ�����", "��Ҫ���ǻ���Ʒ�ϵı���", "��Ҫ��Ǯ���̲���ķ�ɫ", "��Ȼ��", "Ů�������Ա��ֻ����ľ�", "���Լ���������", "�����õľ���״̬", "Ҳ�Ǽ���˥�ϵ������ҩ",
			"�ұȽ�ϲ��һ���˵�����֮��", "�����������Ӿ�ƣ��", "�����Ӳ������ʱ���Ϊ˥ɫ", "������Ƥ��", "�վ�������ʱ��������鵶", "ҲΨ������֮��", "�Ż����������ഺ" };
	private List<String> mLabelList = Arrays.asList(mLabels);

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initFlowLayout();
		initBGAFlowLayout();
	}

	private void initBGAFlowLayout()
	{
		BGAFlowLayout bgaFlowLayout = (BGAFlowLayout) findViewById(R.id.bga_flow_layout);
		for (String label : mLabelList)
		{
			TextView textView = new TextView(this);
			textView.setText(label);
			textView.setBackgroundColor(Color.RED);
			textView.setTextColor(Color.WHITE);
			textView.setTextSize(25);
			textView.setGravity(Gravity.CENTER);
			textView.setPadding(10, 10, 10, 10);
			textView.setTag(BGAFlowLayout.class.getSimpleName() + label);
			textView.setOnClickListener(this);
			ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			textView.setLayoutParams(params);
			bgaFlowLayout.addView(textView);
		}
	}

	private void initFlowLayout()
	{
		FlowLayout flowLayout = (FlowLayout) findViewById(R.id.flow_layout);
		for (String label : mLabelList)
		{
			TextView textView = new TextView(this);
			textView.setText(label);
			textView.setBackgroundColor(Color.CYAN);
			textView.setTextColor(Color.WHITE);
			textView.setTextSize(25);
			textView.setGravity(Gravity.CENTER);
			textView.setPadding(10, 10, 10, 10);
			textView.setTag(FlowLayout.class.getSimpleName() + label);
			textView.setOnClickListener(this);
			ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			textView.setLayoutParams(params);
			flowLayout.addView(textView);
		}
	}

	@Override
	public void onClick(View v)
	{
		Toast.makeText(this, v.getTag().toString(), Toast.LENGTH_SHORT).show();
	}
}
