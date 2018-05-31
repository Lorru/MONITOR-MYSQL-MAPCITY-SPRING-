package cl.geobpo.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROCESSLIST")
public class ProcessList implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private long id;
	
	@Column(name="USER")
	private String user;
	
	@Column(name="HOST")
	private String host;
	
	@Column(name="DB")
	private String db;
	
	@Column(name="COMMAND")
	private String command;
	
	@Column(name="TIME")
	private String time;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="INFO")
	private String info;
	
	@Column(name="TIME_MS")
	private float timeMs;
	
	@Column(name="STAGE")
	private long stage;
	
	@Column(name="MAX_STAGE")
	private long maxStage;
	
	@Column(name="PROGRESS")
	private float progress;
	
	@Column(name="MEMORY_USED")
	private int memoryId;
	
	@Column(name="EXAMINED_ROWS")
	private int examinedRows;
	
	@Column(name="QUERY_ID")
	private long queryId;

	public long getId() {
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getUser() 
	{
		return user;
	}

	public void setUser(String user) 
	{
		this.user = user;
	}

	public String getHost() 
	{
		return host;
	}

	public void setHost(String host) 
	{
		this.host = host;
	}

	public String getDb() 
	{
		return db;
	}

	public void setDb(String db) 
	{
		this.db = db;
	}

	public String getCommand() 
	{
		return command;
	}

	public void setCommand(String command) 
	{
		this.command = command;
	}

	public String getTime() 
	{
		return time;
	}

	public void setTime(String time) 
	{
		this.time = time;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}

	public String getInfo() 
	{
		return info;
	}

	public void setInfo(String info) 
	{
		this.info = info;
	}

	public float getTimeMs() 
	{
		return timeMs;
	}

	public void setTimeMs(float timeMs) 
	{
		this.timeMs = timeMs;
	}

	public long getStage() 
	{
		return stage;
	}

	public void setStage(long stage) 
	{
		this.stage = stage;
	}

	public long getMaxStage() 
	{
		return maxStage;
	}

	public void setMaxStage(long maxStage) 
	{
		this.maxStage = maxStage;
	}

	public float getProgress() 
	{
		return progress;
	}

	public void setProgress(float progress) 
	{
		this.progress = progress;
	}

	public int getMemoryId() 
	{
		return memoryId;
	}

	public void setMemoryId(int memoryId) 
	{
		this.memoryId = memoryId;
	}

	public int getExaminedRows() 
	{
		return examinedRows;
	}

	public void setExaminedRows(int examinedRows) 
	{
		this.examinedRows = examinedRows;
	}

	public long getQueryId() 
	{
		return queryId;
	}

	public void setQueryId(long queryId) 
	{
		this.queryId = queryId;
	}
}
